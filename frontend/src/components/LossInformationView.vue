<template>

    <v-data-table
        :headers="headers"
        :items="lossInformation"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'LossInformationView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            lossInformation : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/lossInformations'))

            temp.data._embedded.lossInformations.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.lossInformation = temp.data._embedded.lossInformations;
        },
        methods: {
        }
    }
</script>


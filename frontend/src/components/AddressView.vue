<template>

    <v-data-table
        :headers="headers"
        :items="address"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'AddressView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            address : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/addresses'))

            temp.data._embedded.addresses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.address = temp.data._embedded.addresses;
        },
        methods: {
        }
    }
</script>

